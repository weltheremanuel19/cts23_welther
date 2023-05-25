package clase;
//Am adaugat, de asemenea, teste unitare in clasa "BankTest" pentru a verifica corectitudinea implementarii acestor metode.
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank();
    }

    @After
    public void tearDown() throws Exception {
        bank = null;
    }

    @Test
    public void setName() {
        String testStr = "shswhrf bank";
        bank.setName(testStr);
        Assert.assertEquals("Set nu este implementat corect", testStr, bank.getName());
        Assert.assertTrue("Minim 5 caractere", bank.getName().length() >= 5);
        Assert.assertTrue("Trebuie să conțină cuvântul bank", bank.getName().toLowerCase(Locale.ROOT).contains("bank"));
    }

    @Test
    public void setAddress() {
        String testAddress = "123 main.Main Street";
        bank.setAddress(testAddress);
        Assert.assertEquals("Adresa nu este setată corect", testAddress, bank.getAddress());
    }

    @Test
    public void setSwiftCode() {
        String testSwiftCode = "ABCDEF123";
        bank.setSwiftCode(testSwiftCode);
        Assert.assertEquals("Codul SWIFT nu este setat corect", testSwiftCode, bank.getSwiftCode());
    }
}
