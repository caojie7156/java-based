package jvm.varstatic;
//static 变量不需要实例化，只要类被加载，变量就能被访问，跟实例化没有关系
public abstract class weekdate {
    private String name;
    private int ordinal;
    private weekdate (String name,int ordinal){
        this.name = name;
        this.ordinal = ordinal;
    }
    public String  nextDay(){
        return "thues";
    };
    public static final String weekvar01 = "allen";
    private static final String weekvar02 = "kobe";
    private static final weekdate weekvar03 = new weekdate("caojie",1) {
        @Override
        public String nextDay() {
            return super.nextDay();
        }
    };
    public static String weekvar04;
}
