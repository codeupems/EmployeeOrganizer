package dao;

public class DaoFactory {
    private static Employees empListDao;

    public static Employees empListDao() {
        if (empListDao == null) {
            empListDao = new EmployeesDao();
        }
        return empListDao;
    }
}