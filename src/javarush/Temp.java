/*
В этой задаче тебе нужно выполнить проверку URL-адреса.

Простая схема URL-адреса выглядит так:
<сетевой протокол>://<название ресурса>.<домен>

Метод checkProtocol(String) проверяет, какой сетевой протокол
(http или https) у URL-адреса, полученного входящим параметром,
и возвращает результат проверки — строку название сетевого протокола.
А метод checkDomain(String) проверяет, какой домен (com, net, org или ru)
у URL-адреса, полученного входящим параметром, и возвращает результат проверки —
строку название домена.

Если URL-адрес начинается не с http или https, то результат будет — "неизвестный".
 Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".

main не принимает участие в тестировании.

Требования:
Нужно, чтобы метод checkProtocol(String) был реализован согласно условию.
Нужно, чтобы метод checkDomain(String) был реализован согласно условию.*/



package javarush;

public class Temp {
    public static String checkProtocol(String url) {
        if (url.startsWith("https://")) {
            return "https";
        }
        if (url.startsWith("http://")) {
            return "http";
        }

        return "неизвестный";
    }


    public static  String checkDomain(String url) {
/*        if (url.endsWith("ru")) {
            return "ru";
        }
        if (url.endsWith("com")) {
            return "com";
        }

        if (url.endsWith("org")) {
            return "org";
        }

        return "неизвестный";*/
        String [] domain = url.split("\\.");
        return switch (domain[1]) {
            case "com" -> "com";
            case "net" -> "net";
            case "org" -> "org";
            case "ru" -> "ru";
            default -> "неизвестный";
        };
    }


    public static void main(String[] args) {
        String[] urls = {
                "https://javarush.ru",
                "https://google.com",
                "http://wikipedia.org",
                "facebook.com",
                "https://instagram",
                "codegym.cc"
        };

        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);
            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);

        }


    }
}

