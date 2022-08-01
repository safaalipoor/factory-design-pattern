public class Math extends Book{
    private String name;
    private int code;
    private int pages;

    public Math(String name, int code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int getCode(){
        return this.code;
    }
    @Override
    public int getPages(){
        return this.pages;
    }
}
