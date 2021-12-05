package com.company.certification.hexacta.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.company.certification.hexacta.util.constant.ConstantManager.CLASE_INTERFAZ_USUARIO;

public class History_01Page {

    public static final Target BUTTON_BLOG = Target.the("Button Blog").located(By.id("menu-item-3960"));
    public static final Target SELECTION_ITEM = Target.the("Selection Item").located(By.className("page-item"));
    public static final Target TOPIC = Target.the("Topic").locatedBy("//*[text()='{0}']");
    public static final Target AUTHOR = Target.the("Author").locatedBy("//*[text()=' {0} ']");
    public static final Target TOPIC_DESTINY = Target.the("Page Destiny").locatedBy("//*[text()='{0}']");
    public static final Target ALL_TITLES = Target.the("All titles").located(By.xpath("//h2[@class='heading-4 post-title']"));
    public static final Target ALL_TITLES_LINK = Target.the("All titles link").located(By.xpath("//h2[@class='heading-4 post-title']/a"));
    public static final Target EMAIL = Target.the("Email").located(By.xpath("//*[@id='mc4wp-form-1']/div[1]/label/input"));
    public static final Target BUTTON_SUBSCRIBE = Target.the("Button Subscribe").located(By.xpath("//*[@id='mc4wp-form-1']/div[1]/button"));


    private History_01Page() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}