package javacore.jdbc.repository;

import javacore.jdbc.conn.ConnectionFacotry;
import javacore.jdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void update(Producer producer){
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement()){
            int rows = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}', Database rows affected '{}'", producer.getId(), rows);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static List<Producer> findAll(){
        log.info("Finding all producers");
        return findByName("");
    }

    public static List<Producer> findByName(String name){
        log.info("Finding by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%'".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void showProducerMetaData(){
        log.info("Showming producer Metadata");
        String sql = "SELECT * FROM anime_store.producer";
        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            rs.next();
            int columnCount = resultSetMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("table name '{}'", resultSetMetaData.getTableName(i));
                log.info("table name '{}'", resultSetMetaData.getColumnName(i));
                log.info("table name '{}'", resultSetMetaData.getColumnDisplaySize(i));
                log.info("table name '{}'", resultSetMetaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while trying show producer metadata", e);
        }
    }

    public static void showDriverMetaData(){
        log.info("Showming producer Metadata");
        try(Connection conn = ConnectionFacotry.getConnection()){
          DatabaseMetaData dbMetaData = conn.getMetaData();
          if(dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
              log.info("Supports TYPE_FORWARD_ONLY");
              if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                  log.info("And supports CONCUR_UPDATABLE");
              }
          }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying show producer metadata", e);
        }
    }
    public static void showTypesScrollWorking(){
        String sql = "SELECT * FROM anime_store.producer";
        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)){

            log.info("Last row ? '{}'", rs.last());
            log.info("Row number ? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("First row ? '{}'", rs.first());
            log.info("Row number ? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row absolute ? '{}'", rs.absolute(2));
            log.info("Row number ? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row relative ? '{}'", rs.relative(-1));
            log.info("Row number ? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("is last '{}'", rs.isLast());
            log.info("Row number '{}'", rs.getRow());

            log.info("Last row '{}'", rs.last());
            log.info("------------------------------------");
            rs.next();
            log.info("After last row '{}'", rs.isAfterLast());
            while (rs.previous()){
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }

        } catch (SQLException e) {
            log.error("Error while trying show producer metadata", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name){
        log.info("Finding by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%'".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name){
        log.info("Finding by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%'".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)){
            if(!rs.next()) return producers;

            insertNewProducer(name, rs);

            producers.add(getProducer(rs));

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String name){
        log.info("Finding by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%'".formatted(name);

        try(Connection conn = ConnectionFacotry.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)){
          while (rs.next()){
              log.info("Deleting '{}'", rs.getString("name"));
              rs.deleteRow();
          }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }

    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
    }
}
