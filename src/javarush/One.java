

package javarush;


public class One {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String inLine1, String version1) {
        int index1 = inLine1.indexOf("jdk");
        int index2 = inLine1.indexOf("/", index1);
        String regex1 = inLine1.substring(index1,index2);
        return inLine1.replaceAll(regex1,version1);
    }
}


