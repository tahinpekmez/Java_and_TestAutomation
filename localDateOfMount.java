        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // date format
        LocalDateTime now = LocalDateTime.now(); // current time
        LocalDate localDate = LocalDate.parse(dtf.format(now)); // current time via the format
        int day = localDate.getDayOfMonth(); // get day which is today
