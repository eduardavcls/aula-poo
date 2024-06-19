package com.poo.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {public class LimpaTerminal {
        static void limpa_windows() {
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.println("Este comando só funciona no Windows.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
	}

}
