// HOW TO DELETE FILES HAVE EXTENSION IS .png ?

        File folder = new File("./Reports");
        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".png")) {
                file.delete();
            }
        }
