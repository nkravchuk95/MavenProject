package regression;

import com.trello.ui.core.BrowserFactory;
import com.trello.ui.pages.BoardsPage;
import com.trello.ui.pages.LoginPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

/**
 * Created by lolik on 20.06.2019
 */
@Epic("REGRESSION")
@Feature("LOGIN")
public class LoginTest extends BrowserFactory {

    LoginPage loginPage = new LoginPage();
    BoardsPage boardsPage = new BoardsPage();

    @Story("Login By Regular User: JackSparrow")
    @Test
    public void login() {
        loginPage.open();
        loginPage.login("loliktestintegration@gmail.com", "qwe1rty2");
        boardsPage.openBoard("jacksparrowtitle");
    }

}
