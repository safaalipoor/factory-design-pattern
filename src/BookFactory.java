public class BookFactory {
    public static Book GetBook(String type, String name , int code , int pages){
        if ("Math".equalsIgnoreCase(type))
            return new Math(name , code , pages);
        if ("Biology".equalsIgnoreCase(type))
            return new Biology(name , code,pages);
        if ("History".equalsIgnoreCase(type))
            return new History(name , code , pages);
        return null;
    }
}

