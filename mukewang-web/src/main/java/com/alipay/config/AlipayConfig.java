package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    public static String app_id = "2016092000551678";

    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCzrUthz5AHCxb1xAn9V72S5CqMP5i3mybfB8SWnfrX8DjnchM7SkmmWElifp4OF2aWFjIvjdw6CGAM1pta2RU+HSbVVxFeiC7q9W2rWcXg2P6oFQpjFEmM48E4bnK3taOmnr41rAdT/7DcMIlURVmDTp1QpZWoqPJV1bqQgTHVJ6XLNkmRP+TG+FTShLmuYDZdSJooH5K5MG0BtHNfbcLI6rBo/peVtw3Xx6XXE6cTlNv9DX3zgXMwdwqzonWfEvCVoW7oZcuk7paqei0wnXg0VyAZ6Ypn4HuDEdCMTImcl/ah0VBqoWwBhatNilEDARee9ls5fYWHCrCpDQq91N+nAgMBAAECggEBAKbXONM3QH85zfUiN0B3E8JtehDHEREU0dBxzxso0P9owf4wECmS/ram7mW2Ox/MnOaq76j2qlN86Wuib5m5UB9gRGn/slI8VIy6nz5oWvVBqZ38A6wi73UTG51B+eYalT6n0unVtuxJ1jlwHGUTDF6ARlXXnBOD5ZrMnrOGM/a/jCSoqHmfaNAqR6IWIwRRZkjjv4WjyNOCUKXIBlXn/7F1prugLFKXRPEVbjIaFIhvZ67Sxcfhpmsf9tl4B02coVNLj2qDtYjZlszNMjyUSEuSLBo8Tey9+MPDivkh2sqetGYb0sxZrkF457SZUZwQ80a3LGUsWp58ne2ANvOZlKECgYEA8JxigOOdd5q8M9MDgxQwE8InUVniw6mviK9sXeV62+gACx12Buk+FO1DvtqchB1pdiQVXkwApRsapeXQIwaWxVuj0zrsVhHiX9qU6/txgZ1UO39w4g5xLaOJ0A+VR7jngFKsbvWP56/Ud6F4o3ss6cWnHGuZ3auliPtStWDIJ7cCgYEAvys27FIUc7Y6QOihKseNMquUAiO1WbeQyumT4mG/BJJntNvXWUwlAhXSZgXQ1XRuKHMRYv0Q56yC0FjUN3SUuUeGL0qJOuWOzPTsUD1AKyytEZ88XtQLV4qUVk0rAoRyclOAVLu8MHynnkF2VMiyxJO7kndP0vBPWY2SMw3ip5ECgYBhddbogkocUk79ZvG7PIgk2LX4W8JgovD5GqV4eyWCwbySxAI01nFRJLIWMpLHaOp48jC9m2d/eTUYEbh3F4omsvHu86UbT+80CGPeGmFlsQaXew2MY3EwnVeLMWS0Qo9zCQnTgCAkJrKXKo6lGZWds3P3LRaMFaTdkX90/JjWjQKBgQCSpnEcux6rYZiwoIS6j5i2zT7eoUwGhjZSIvtqh/eEZ1edO6SpASvGvLzJvR5mEUpMR3GIEYC9aO51LB+oZwuMUt0SPEin4OA6RI1gRIyMUlp2EUS7rkkBH/MJfWtIJBizsXDaD6afP5FKawd+pPPWr0oOYu7eb7E/jsYf2kAMsQKBgDQOSdU2VuORi2/vpIXIORnrqELr13cwLMZH70ovumt5MJ16OirahOxpSZlMLv4VCrE+s3ofoNnhHWMO8kgHBrAa3AGlMn/+HUaDESxfhutbMliX0ly0ej6ZrwHLefNi0p2NCoXQe/Pfb0ObGr6WfRCsk6dkI36C9DQJAHDzeG7A";

    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1Zh1H26CPV7ry0HX7/vMj6FDq9hy/sHwSpVbaRRwRcM1rbPxwXklo9IPkaBMiv7hnK2rLCcoy1gwKZy0kq5cxyczrVX3WbA3JM5JnmfoKbnY1X86NQWtPTGHmnqqCjCGjXDNQb6aLMitKJ25s8Ro3KKwp8HA4qK0yy5wi9h5ja2ECvEuZXrVV+W7icHq26Fhz/NxvAkBzl1v/suY5EQ+Cc3OonxQrBxoGgv8Hntl7UY1lCguRpjjYDHUhA40KxSSSynhMv/7sLHekCXd6EbJsJ1CqV6tyDqwG+Ybl43SS+MqSYoUH1qQVwHvJfLJY+zpm+i6GXsU/b/MStOowmizVwIDAQAB/vMj6FDq9hy/sHwSpVbaRRwRcM1rbPxwXklo9IPkaBMiv7hnK2rLCcoy1gwKZy0kq5cxyczrVX3WbA3JM5JnmfoKbnY1X86NQWtPTGHmnqqCjCGjXDNQb6aLMitKJ25s8Ro3KKwp8HA4qK0yy5wi9h5ja2ECvEuZXrVV+W7icHq26Fhz/NxvAkBzl1v/suY5EQ+Cc3OonxQrBxoGgv8Hntl7UY1lCguRpjjYDHUhA40KxSSSynhMv/7sLHekCXd6EbJsJ1CqV6tyDqwG+Ybl43SS+MqSYoUH1qQVwHvJfLJY+zpm+i6GXsU/b/MStOowmizVwIDAQAB";

    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    public static String return_url = "http://localhost:8080/";
    public static String sign_type = "RSA2";

    public static String charset = "utf-8";

    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    public static String log_path = "C:/";



    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
