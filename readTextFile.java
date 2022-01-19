public void readStringTxtFileAndAddToList(String fileName) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader(fileName));
        List<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();

        while (line != null) {
            listOfLines.add(line);
            line = bufReader.readLine();
        }
            for (String domain : listOfLines) {
                sleep(100L);
                loginAsPUser(domain);
                keepSettingsForTheme(domain);
            }
        }
