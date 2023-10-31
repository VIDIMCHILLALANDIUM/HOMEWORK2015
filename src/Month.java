public class Month {
    public static void daysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("Январь 2015 года: 31 день");
                break;
            case 2:
                System.out.println("Февраль 2015 года: 28 дней");
                break;
            case 3:
                System.out.println("Март 2015 года: 31 день");
                break;
            case 4:
                System.out.println("Апрель 2015 года: 30 дней");
                break;
            case 5:
                System.out.println("Май 2015 года: 31 день");
                break;
            case 6:
                System.out.println("Июнь 2015 года: 30 дней");
                break;
            case 7:
                System.out.println("Июль 2015 года: 31 день");
                break;
            case 8:
                System.out.println("Август 2015 года: 31 день");
                break;
            case 9:
                System.out.println("Сентябрь 2015 года: 30 дней");
                break;
            case 10:
                System.out.println("Октябрь 2015 года: 31 день");
                break;
            case 11:
                System.out.println("Ноябрь 2015 года: 30 дней");
                break;
            case 12:
                System.out.println("Декабрь 2015 года: 31 день");
                break;
            default:
                System.out.println("Введен некорректный номер месяца");
        }
    }

    public static void main(String[] args) {
        daysInMonth(2);
    }
}
