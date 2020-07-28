package observer;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreadSheet sheet1 = new SpreadSheet();
        SpreadSheet sheet2 = new SpreadSheet();
        SpreadSheet sheet3 = new SpreadSheet();
        Chart chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(sheet3);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

    }
}
