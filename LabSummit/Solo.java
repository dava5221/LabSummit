package LabSummit;

import java.util.Random;
import java.util.Scanner;

public class Solo {
    static void ShowtheVotes(String[] countrylist, String[] ShowVoteResult){
        System.out.println("=====Итоги голосования=====");
        for(int i = 0;i < 30;i++){
            String country = countrylist[i];
            String voteresult = ShowVoteResult[i];
            int maxcountryleng = 30;
            int maxresleng = 15;
            country = country + " ".repeat(maxcountryleng - country.length());
            voteresult = voteresult + " ".repeat(maxresleng - voteresult.length());
            System.out.println(country + " | " + voteresult);
        }
        System.out.println("-------------------------------------------------");
    }
    static void itog(int votesYes,int votesNo,int votesIgnore,int numbofquest, String[] results){
        String result;
        if (votesYes > 15) {result = "Принято"; results[numbofquest] = "Принято";}
        else {result = "Отклонено"; results[numbofquest] = "Отклонено";}
        System.out.println("Голосов ✔️ За: " + votesYes);
        System.out.println("Голосов ✖️ Против: " + votesNo);
        System.out.println("Голосов ⓿ Воздержался: " + votesIgnore);
        System.out.println("Итог: " + result);
        System.out.println("-------------------------------------------------");
    }
    static boolean startofthesummit(String[] countrylist, String[] questionlist,String[] results) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] ShowVoteResult = new String[30];
        String finalchoiceofRussia = "";
        int numbofquest = 0;
        System.out.println("=====Начало заседания=====");
        int votesYes = 0;
        int votesNo = 0;
        int votesIgnore = 0;
        while (numbofquest < 7) {
            votesYes = 0;
            votesNo = 0;
            votesIgnore = 0;
            System.out.println("******Примите решение******");
            System.out.println("1. Провести голосование");
            System.out.println("2. Покинуть зал заседаний");
            int choicce = scanner.nextInt();
            if (choicce == 1){
                System.out.println("~~~~~~Желает выступить " + countrylist[random.nextInt(countrylist.length)] + "~~~~~");
                System.out.println("");
                System.out.println("Вопрос " + (numbofquest+1) + ". " + questionlist[numbofquest]);
                System.out.println("");
                for (int i = 0; i < countrylist.length; i++) {
                    String currentcountry = countrylist[i];
                    String[] friendlyCountries = {"Бразилия", "Индия", "Китай", "ЮАР", "Египет", "Иран", "ОАЭ", "Эфиопия", "Беларусь", "Венесуэла", "Сирия", "КНДР"};
                    String[] enemyCountries = {"США", "Канада", "Великобритания", "Франция", "Германия", "Италия", "Япония"};
                    String[] neutralCountries = {"Австрия", "Азербайджан", "Албания", "Алжир", "Андорра", "Антигуа и Барбуда", "Аргентина",
                        "Армения", "Афганистан", "Багамы", "Бангладеш", "Барбадос", "Бахрейн", "Беларусь",
                        "Белиз", "Бенин", "Бутан", "Болгария", "Боливия", "Босния и Герцеговина", "Ботсвана",
                        "Буркина-Фасо", "Бурунди", "Вануату", "Ватикан", "Венесуэла", "Вьетнам", "Габон",
                        "Гаити", "Гайана", "Гамбия", "Гана", "Гватемала", "Гвинея", "Гвинея-Бисау", "Гондурас",
                        "Гренада", "Грузия", "Дания", "Джибути", "Доминика", "Доминиканская Республика",
                        "Замбия", "Зимбабве", "Израиль", "Индонезия", "Иордания", "Ирак",
                        "Ирландия", "Исландия", "Йемен", "Кабо-Верде", "Казахстан", "Камбоджа", "Камерун",
                        "Катар", "Кения", "Кипр", "Киргизия", "Кирибати", "Колумбия", "Коморы", "Коста-Рика",
                        "Куба", "Кувейт", "Лаос", "Латвия", "Лесото", "Либерия", "Ливан", "Ливия", "Литва",
                        "Лихтенштейн", "Люксембург", "Маврикий", "Мавритания", "Мадагаскар", "Малави",
                        "Малайзия", "Мали", "Мальдивы", "Мальта", "Марокко", "Маршалловы Острова", "Мексика",
                        "Микронезия", "Мозамбик", "Молдова", "Монако", "Монголия", "Мьянма", "Намибия",
                        "Науру", "Непал", "Нигер", "Нигерия", "Никарагуа", "Новая Зеландия", "Норвегия",
                        "ОАЭ", "Оман", "Палестина", "Панама", "Папуа-Новая Гвинея", "Парагвай", "Перу",
                        "Польша", "Португалия", "Южная Корея", "Руанда", "Румыния", "Сальвадор",
                        "Самоа", "Сан-Марино", "Сан-Томе и Принсипи", "Саудовская Аравия", "Северная Македония",
                        "Сейшелы", "Сенегал", "Сент-Винсент и Гренадины", "Сент-Китс и Невис", "Сент-Люсия",
                        "Сербия", "Сингапур", "Сирия", "Словакия", "Словения", "Соломоновы Острова",
                        "Сомали", "Судан", "Суринам", "Сьерра-Леоне", "Таджикистан", "Таиланд", "Танзания",
                        "Того", "Тонга", "Тринидад и Тобаго", "Тувалу", "Тунис", "Туркмения", "Турция",
                        "Уганда", "Узбекистан", "Уругвай", "Фиджи", "Филиппины", "Финляндия", "Хорватия",
                        "ЦАР", "Чад", "Черногория", "Чехия", "Чили", "Швейцария", "Шри-Ланка", "Эквадор",
                        "Экваториальная Гвинея", "Эритрея", "Эсватини", "Южный Судан", "Ямайка"};
                    if (currentcountry.equals("Россия")) {
                        System.out.println("Введите ваше решение (1 - Поддерживаю, 2 - Отклоняю, Для того чтобы воздержаться введите любое число):");
                        int choiceofRussia = scanner.nextInt();
                        switch (choiceofRussia) {
                            case 1:
                                finalchoiceofRussia = "✔️ За";
                                ShowVoteResult[i] = "✔️ За";
                                votesYes++;
                                break;
                            case 2:
                                finalchoiceofRussia = "✖️ Против";
                                ShowVoteResult[i] = "✖️ Против";
                                votesNo++;
                                break;
                            default:
                                finalchoiceofRussia = "⓿ Воздержался";
                                ShowVoteResult[i] = "⓿ Воздержался";
                                votesIgnore++;
                                break;

                        }
                    }
                    else{
                        boolean friendlycountry = false;
                        boolean enemycountry = false;
                        boolean dontcarecountry = false;
                        for (int g = 0; g < friendlyCountries.length; g++) {
                            if (currentcountry.equals(friendlyCountries[g])) friendlycountry = true;
                        }
                        for (int g = 0; g < enemyCountries.length; g++) {
                            if (currentcountry.equals(enemyCountries[g])) enemycountry = true;
                        }
                        for (int g = 0; g < neutralCountries.length; g++) {
                            if (currentcountry.equals(neutralCountries[g])) dontcarecountry = true;
                        }
                        if (finalchoiceofRussia.equals("⓿ Воздержался")){
                            int choice = random.nextInt(3);
                            if (choice == 0) {votesYes++; ShowVoteResult[i] = "✔️ За";}
                            else if (choice == 1) { votesNo++; ShowVoteResult[i] = "✖️ Против";}
                            else if (choice == 2) { votesIgnore++; ShowVoteResult[i] = "⓿ Воздержался";}
                        }
                        else if (friendlycountry && finalchoiceofRussia.equals("✔️ За")){ votesYes++; ShowVoteResult[i] = "✔️ За";}
                        else if (friendlycountry && finalchoiceofRussia.equals("✖️ Против")) {votesNo++; ShowVoteResult[i] = "✖️ Против";}
                        else if (enemycountry && finalchoiceofRussia.equals("✔️ За")){ votesNo++; ShowVoteResult[i] = "✖️ Против";}
                        else if (enemycountry && finalchoiceofRussia.equals("✖️ Против")) {votesYes++;ShowVoteResult[i] = "✔️ За";}
                        else if (dontcarecountry) {
                            int choice = random.nextInt(3);
                            if (choice == 0) {
                                votesYes++;
                                ShowVoteResult[i] = "✔️ За";
                            } else if (choice == 1) {
                                votesNo++;
                                ShowVoteResult[i] = "✖️ Против";
                            } else if (choice == 2) {
                                votesIgnore++;
                                ShowVoteResult[i] = "⓿ Воздержался";
                            }
                        }
                    }
                }
            }
            else{
                System.out.println("Вы встаёте со стула и покидаете зал заседаний...");
                break;
            }
            ShowtheVotes(countrylist,ShowVoteResult);
            itog(votesYes,votesNo,votesIgnore,numbofquest,results);
            numbofquest++;
        }

        return true;
    }

    static String[] createthelistofquestion() {
        Random random = new Random();
        String[] qq = new String[]{"Поддерживаете ли вы создание единого международного экономического союза?",
                "Одобряете ли вы предложение о разоружении всех ядерных государств?",
                "Согласны ли вы признать традиционную кухню России мировым культурным наследием?",
                "Согласны ли вы с предложением о создании международной космической станции на Луне?",
                "Поддерживаете ли вы инициативу по глобальному сокращению выбросов углекислого газа?",
                "Согласны ли вы с предложением о создании международного антикоррупционного трибунала?",
                "Поддерживаете ли вы расширение доступа к медицинским технологиям для развивающихся стран?",
                "Одобряете ли вы введение санкций против стран, нарушающих международное право?",
                "Согласны ли вы с инициативой о свободной торговле между всеми странами?",
                "Поддерживаете ли вы проведение международного фестиваля культуры в 2025 году?",
                "Согласны ли вы с введением единого стандарта качества продуктов питания в мире?",
                "Поддерживаете ли вы создание глобальной сети высокоскоростных железных дорог?",
                "Согласны ли вы с запретом на использование оружия массового поражения?",
                "Поддерживаете ли вы усиление мер по защите редких животных?",
                "Согласны ли вы с увеличением финансирования международных научных проектов?"};
        String currentqq[] = new String[7];
        for (int i = 0; i < 7; i++) {
            String temp = qq[random.nextInt(qq.length)];
            boolean exists = false;
            for (int g = 0; g < i; g++) {
                if (currentqq[g].equals(temp)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) currentqq[i] = temp;
            else i--;
        }
        return currentqq;
    }

    static String[] createthelistofcountry() {
        Random random = new Random();
        String[] bricsCountries = {"Россия", "Бразилия", "Индия", "Китай", "ЮАР", "Египет", "Иран", "ОАЭ", "Эфиопия"};
        String[] g7Countries = {"США", "Канада", "Великобритания", "Франция", "Германия", "Италия", "Япония"};
        String[] other = {"Австрия", "Азербайджан", "Албания", "Андорра", "Антигуа и Барбуда", "Аргентина",
                "Армения", "Афганистан", "Багамы", "Бангладеш", "Барбадос", "Бахрейн", "Беларусь",
                "Белиз", "Бенин", "Бутан", "Болгария", "Боливия", "Босния и Герцеговина", "Ботсвана",
                "Буркина-Фасо", "Вануату", "Ватикан", "Венесуэла", "Вьетнам", "Габон",
                "Гаити", "Гайана", "Гамбия", "Гана", "Гватемала", "Гвинея", "Гвинея-Бисау", "Гондурас",
                "Гренада", "Грузия", "Дания", "Джибути", "Доминика", "Доминиканская Республика",
                "Замбия", "Зимбабве", "Израиль", "Индонезия", "Иордания", "Ирак",
                "Ирландия", "Исландия", "Йемен", "Кабо-Верде", "Казахстан", "Камбоджа",
                "Катар", "Кипр", "Кирибати", "Колумбия", "Коморы", "Коста-Рика",
                "Куба", "Лаос", "Латвия", "Лесото", "Либерия", "Ливан", "Ливия", "Литва",
                "Лихтенштейн", "Люксембург", "Маврикий", "Мавритания", "Мадагаскар", "Малави",
                "Малайзия", "Мали", "Мальдивы", "Мальта", "Марокко", "Маршалловы Острова", "Мексика",
                "Микронезия", "Мозамбик", "Молдова", "Монако", "Мьянма", "Намибия",
                "Науру", "Непал", "Нигер", "Нигерия", "Никарагуа", "Новая Зеландия", "Норвегия"
                , "Палестина", "Панама", "Папуа-Новая Гвинея", "Парагвай", "Перу",
                "Польша", "Португалия", "Южная Корея", "Руанда", "Румыния", "Сальвадор",
                "Самоа", "Сан-Марино", "Сан-Томе и Принсипи", "Саудовская Аравия", "Северная Македония",
                "Сейшелы", "Сенегал", "Сент-Винсент и Гренадины", "Сент-Китс и Невис", "Сент-Люсия",
                "Сербия", "Сингапур", "Сирия", "Словакия", "Словения", "Соломоновы Острова",
                "Сомали", "Судан", "Суринам", "Сьерра-Леоне", "Таиланд", "Танзания",
                "Того", "Тонга", "Тринидад и Тобаго", "Тувалу", "Тунис", "Туркмения", "Турция",
                "Уганда", "Уругвай", "Фиджи", "Филиппины", "Финляндия", "Хорватия",
                "ЦАР", "Чад", "Черногория", "Чехия", "Чили", "Швейцария", "Шри-Ланка", "Эквадор",
                "Экваториальная Гвинея", "Эритрея", "Эсватини", "Южный Судан", "Ямайка"};
        String[] asian = {"Киргизия","КНДР","Монголия","Южная Корея","Таджикистан","Узбекистан","Оман"};
        String[] afrika = {"Алжир","Бурунди","Камерун","Кения","Кувейт"};
        String[] voters = new String[30];
        for (int i = 0; i < 9; i++) {
            voters[i] = bricsCountries[i];
        }
        for (int i = 9; i < 16; i++) {
            voters[i] = g7Countries[i - 9];
        }
        for (int i = 16; i < 23; i++) {
            voters[i] = asian[i - 16];
        }
        for (int i = 23; i < 26; i++) {
            String temp = afrika[random.nextInt(afrika.length)];
            boolean exists = false;
            for (int g = 0; g < i; g++) {
                if (voters[g].equals(temp)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                voters[i] = temp;
            } else {
                i--;
            }
        }
        for (int i = 26; i < 30; i++) {
            String temp = other[random.nextInt(other.length)];
            boolean exists = false;
            for (int g = 0; g < i; g++) {
                if (voters[g].equals(temp)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                voters[i] = temp;
            } else {
                i--;
            }
        }

        return voters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] results = new String[7];
        String[] countrylist = createthelistofcountry();
        String[] questionlist = createthelistofquestion();
        while (true){
            System.out.println("======Саммит стран 2024!======");
            System.out.println("1.Увидеть список прибывших");
            System.out.println("2.Провести голосование");
            System.out.println("3.Отказаться от участия");
            boolean end = false;
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*******На заседание прибыли*******");
                    for (int i = 0; i < 30; i++) {
                        System.out.println((i + 1) + ". " + countrylist[i]);
                    }
                    break;
                case 2:
                    end = startofthesummit(countrylist, questionlist,results);
                    break;
                default:
                    System.out.println("Вы встаёте со стула и покидаете зал заседаний...");
                    return;
            }
            if (end){
                System.out.println("======Саммит окончен!======");
                for(int i = 0;i < 7;i++){
                    System.out.println(questionlist[i]+": " + results[i]);
                }
                System.out.println("===============================================================================");
                break;
            }
        }
    }
}