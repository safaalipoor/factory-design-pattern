public class test {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        Book math = BookFactory.GetBook("Math" , "highSchool math", 1,250 );
        Book biology = BookFactory.GetBook("Biology","highSchool biology",2,140);
        Book history = BookFactory.GetBook("History","midSchool history",3,100);
        System.out.println("Math :" +
                "    name :"+ math.getName()
                +"   code:" +math.getCode()
                + "    pages:" +math.getPages());
        System.out.println("Biology :" +
                "    name :"+ biology.getName()
                + "   code:"+biology.getCode()
                + "   pages:"+biology.getPages());
        System.out.println("History :" +
                "    name :"+ history.getName()
                +"   code:"+history.getCode()
                + "   pages:"+history.getPages());
    }
}

