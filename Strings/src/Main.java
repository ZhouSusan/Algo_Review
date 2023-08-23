public class Main {
    public static void main(java.lang.String[] args) {
        String strOne = "object oriented programming";
        System.out.println(CustomizeString.acronymize(strOne));

        String strTwo = "  global   information tracker    ";
        System.out.println(CustomizeString.acronymize(strTwo));

        String honorificOne = "Sir";
        String[] namesOne =  {"Sanchez, Rick", "Smith, Jerry"};
        String[] namesWithHonorific = CustomizeString.addHonorific(honorificOne, namesOne);
        for (String name : namesWithHonorific) {
            System.out.println(name);
        }
    }
}
