import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBCustomer {
    private  List<Customer> customerList;
    private static  DBCustomer dbCustomer = new DBCustomer();
    public static DBCustomer getDbCustomer() {
        return dbCustomer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    private DBCustomer() {
        customerList = new ArrayList<>();
        customerList.add(new Customer("Nguyễn Văn B", "09-07-2002", "Tiền Giang", "https://scontent.fsgn4-1.fna.fbcdn.net/v/t1.15752-9/327748390_1085109105687845_244048071471674980_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=ae9488&_nc_ohc=4GErq7kAN0UAX_Jk3x9&_nc_ht=scontent.fsgn4-1.fna&oh=03_AdTQEiaeLpZrTU-NpwRw_7uxBWIFb--ac-AuWWySxq3pvw&oe=64097CDB"));
        customerList.add(new Customer("Nguyễn Văn A", "09-07-2002", "Tiền Giang", "https://scontent.fsgn4-1.fna.fbcdn.net/v/t1.15752-9/327748390_1085109105687845_244048071471674980_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=ae9488&_nc_ohc=4GErq7kAN0UAX_Jk3x9&_nc_ht=scontent.fsgn4-1.fna&oh=03_AdTQEiaeLpZrTU-NpwRw_7uxBWIFb--ac-AuWWySxq3pvw&oe=64097CDB"));
        customerList.add(new Customer("Nguyễn Văn T", "09-07-2002", "Tiền Giang", "https://scontent.fsgn4-1.fna.fbcdn.net/v/t1.15752-9/327748390_1085109105687845_244048071471674980_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=ae9488&_nc_ohc=4GErq7kAN0UAX_Jk3x9&_nc_ht=scontent.fsgn4-1.fna&oh=03_AdTQEiaeLpZrTU-NpwRw_7uxBWIFb--ac-AuWWySxq3pvw&oe=64097CDB"));
        customerList.add(new Customer("Nguyễn Văn D", "09-07-2002", "Tiền Giang", "https://scontent.fsgn4-1.fna.fbcdn.net/v/t1.15752-9/327748390_1085109105687845_244048071471674980_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=ae9488&_nc_ohc=4GErq7kAN0UAX_Jk3x9&_nc_ht=scontent.fsgn4-1.fna&oh=03_AdTQEiaeLpZrTU-NpwRw_7uxBWIFb--ac-AuWWySxq3pvw&oe=64097CDB"));
        customerList.add(new Customer("Nguyễn Văn E", "09-07-2002", "Tiền Giang", "https://scontent.fsgn4-1.fna.fbcdn.net/v/t1.15752-9/327748390_1085109105687845_244048071471674980_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=ae9488&_nc_ohc=4GErq7kAN0UAX_Jk3x9&_nc_ht=scontent.fsgn4-1.fna&oh=03_AdTQEiaeLpZrTU-NpwRw_7uxBWIFb--ac-AuWWySxq3pvw&oe=64097CDB"));
    }

    public void add(Customer c) {
        customerList.add(c);
    }

//    public List<Customer> get() {
//        return customerList;
//    }
}
