package javacore.concorrencia.test;

import javacore.concorrencia.dominio.Quote;
import javacore.concorrencia.service.StoreServiceDeprecated;
import javacore.concorrencia.service.StoreServiceWilthDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWilthDiscount service = new StoreServiceWilthDiscount();
//        searchPricesAsyncCompletableFuture(service);
        searchPricesWithDiscountAsyncCompletable(service);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceWilthDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("store 1", "store 2", "store 3", "store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);


        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
    }

    private static void searchPricesWithDiscountAsyncCompletable(StoreServiceWilthDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("store 1", "store 2", "store 3", "store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        List<CompletableFuture<String>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(q -> CompletableFuture.supplyAsync(() -> service.applyDiscount(q))))
                .collect(Collectors.toList());

        collect.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);


        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
    }
}
