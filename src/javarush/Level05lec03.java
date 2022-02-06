package javarush;

class Level05lec03 {
    public static void main(String[] args) {
        String[] array = {"Hello", "Hello", "World", "Java", "Tasks", "World"};

        for (int i = 0; i < array.length; i++) {
            String currentString = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (currentString == null) {
                    break;
                }
                else if (currentString.equals(array[j])) {
                    array[j] = null;
                    array[i] = null;
                }
            }
        }
        for (String string : array) {
            System.out.print(string + ", ");
        }

    }
}