public class DaoFactory {
    private static Employees empListDao;
    public static Employees empListDao() {
        if (empListDao == null) {
            empListDao = new Employees();
        }
        return Employees;
    }
}