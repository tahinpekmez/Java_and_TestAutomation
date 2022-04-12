        RestTemplate restTemplate = new RestTemplate();
        org.springframework.http.HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Header", "Value");
        org.springframework.http.HttpEntity<?> httpEntity = new HttpEntity<>(requestHeaders);
        restTemplate.exchange(configuration.getProperty("site_url"), org.springframework.http.HttpMethod.GET, httpEntity, String.class);
