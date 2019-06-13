public class DaoFactory {
    private static EmpList empListDao;
    public static EmpList empListDao() {
        if (empListDao == null) {
            empListDao = new MySQLAdsDao();
        }
        return adsDao;
    }
}