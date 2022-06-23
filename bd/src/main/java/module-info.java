open module com.example.bd {
    requires java.sql;
    requires javax.persistence;

    exports com.example.bd.BLL;
    exports com.example.bd.DAL;
}