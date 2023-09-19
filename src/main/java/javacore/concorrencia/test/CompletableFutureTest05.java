package javacore.concorrencia.test;

import javacore.concorrencia.dominio.Quote;
import javacore.concorrencia.service.StoreServiceWilthDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWilthDiscount service = new StoreServiceWilthDiscount();
//        searchPricesAsyncCompletableFuture(service);
        searchPricesWithDiscountAsyncCompletable(service);
    }

    private static void searchPricesWithDiscountAsyncCompletable(StoreServiceWilthDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("store 1", "store 2", "store 3", "store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(q -> CompletableFuture.supplyAsync(() -> service.applyDiscount(q))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b", voidCompletableFuture.isDone());



        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
    }
}
