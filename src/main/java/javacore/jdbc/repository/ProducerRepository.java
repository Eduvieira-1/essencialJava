package javacore.jdbc.repository;

import javacore.jdbc.conn.ConnectionFacotry;
import javacore.jdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement()){
            int rows = stmt.executeUpdate(sql);
            log.info("Database rows affected {}", rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id){
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement()){
            int rows = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}', Database rows affected '{}'", id, rows);
        } catch (SQLException e) {
           log.error("Error while trying to delete producer '{}'", id, e);
        }
    }
}
