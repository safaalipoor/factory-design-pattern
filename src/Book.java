public abstract class Book {
    public abstract String getName() ;
    public abstract int getCode() ;
    public abstract int getPages();

    @Override
    public String toString(){
        return "name : "+this.getName() +" code :"+this.getCode() + "pages :"+ this.getPages() ;
    }
}

