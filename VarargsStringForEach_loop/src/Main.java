public class Main {
    public static void main(String[] args) {
     //    varargs("Aidai","Alina","Dasha");

     //   String a = "Malina";
      //  System.out.println(a.endsWith("na")); Возвращает boolean значение. Проверяет наличие вами данной строки в конце
      //  System.out.println(a.startsWith("Mal")); Тоже возвращает boolean значение. Проверяет наличие данной вами строки в начале
      //  System.out.println(a.indexOf("a")); // Возвращает индекс вам данного символа
      //  varargs(new int[]{15,17,21,24},"Aidana", "Diana", "Dilnaz","Aijan");

        String a = "  I like Java!!!";
        System.out.println(a.charAt(a.length()-1));
        System.out.println(a.endsWith("!!!"));
        System.out.println(a.startsWith("I like"));
        System.out.println(a.contains("Java"));
        System.out.println(a.replace("a","o"));
        String word = a.substring(9,13);
        System.out.println(word.toUpperCase());
        System.out.println(a.substring(9,13).toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(a.length());
        System.out.println(a);
        System.out.println(a.trim());
    }
//    static void varargs( int[] age, String ... names){
//        for (int i = 0; i < age.length; i++) {
//            System.out.println(names[i] + " " + age[i] + " лет");
//        }
  //  }
}