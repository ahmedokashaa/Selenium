package PagesOfSwaglabs;

import org.openqa.selenium.By;

public class FinishPage {

        private  By Finish = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

        public By GetFinish(){
            return Finish;
        }
    }

