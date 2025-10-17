package arttoframe.Crm_Email_PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestOrder {
	private WebDriver driver;
	
		
	// Locating
	@FindBy(xpath  = "(//img[@id='91419'])[2]")
    private WebElement selectRegularFrame;
	
	@FindBy(xpath  = "(//img[@id='apply_frame_main_0'])[1]")
    private WebElement selectFrame;
	
	@FindBy(xpath = "(//img[@alt='Satin White Frame'])[1]" )
    private WebElement changeFrame;
	
	@FindBy(xpath = "(//div[@class='sellAllFrame seeall_btn'])[1]" )
    private WebElement clickSeeAll;
	
	@FindBy(id = "ui-id-1" )
    private WebElement seeAllFrameTab;
	
	
	@FindBy(xpath = "(//img[@id='img_no_mat-0066-59504-YBLK'])[1]" )
    private WebElement seeAllFrame;
	
	@FindBy(xpath = "(//img[@alt='Black with Beads'])[2]" )
    private WebElement GlassSeeAllFrame;
	
	@FindBy(id = "ui-id-2" )
    private WebElement seeAllSizeTab;
	
	@FindBy(id = "ui-id-2" )
    private WebElement  GlassSeeAllSizeTab;
	
	@FindBy(id = "custom-dm-5x7" )
    private WebElement seeAllSize;
	
	@FindBy(id = "custom-dm-5x7" )
    private WebElement  GlassSeeAllSize;
	
	@FindBy(id = "ui-id-4" )
    private WebElement seeAllGlassTab;
	
	@FindBy(id = "ui-id-4" )
    private WebElement  GlassSeeAllGlassTab;
	
	@FindBy(id = "glass_id_114" )
    private WebElement seeAllGlass;
	
	@FindBy(id = "glass_id_114" )
    private WebElement GlassSeeAllGlass;
	
	@FindBy(id = "ui-id-5")
    private WebElement seeAllHardwareTab;
	
	@FindBy(id = "ui-id-5")
    private WebElement GlassSeeAllHardwareTab;
	
	@FindBy(id = "ui-id-6")
    private WebElement seeAllBackingTab;
	
	@FindBy(xpath = "(//span[@class='backing-label sel-backing '])[1]")
    private WebElement seeAllBacking;
	
	@FindBy(xpath = "(//span[@aria-hidden='true'])[6]")
    private WebElement seeAllClose;
	
	
	@FindBy(xpath = "(//span[@class='SelectHDW_NEW'])[3]")
    private WebElement seeAllHardware;
	
	@FindBy(xpath = "(//span[@class='SelectHDW_NEW'])[3]")
    private WebElement GlassSeeAllHardware;
	
	@FindBy(xpath = "(//label[@for='addrborder_5'])[1]")
    private WebElement GlassTab;
	
	@FindBy(xpath = "(//label[@class='txt_limit selectRadio glassRadio glass_label2 glasss_22 glass_22 clsactiveoption1 active'])[1]")
    private WebElement GlassTabSelect;
	
	
	@FindBy(id = "106" )
    private WebElement seeAllCollageSize;
	
	@FindBy(id = "getHwdId" )
    private WebElement clickHardwarePopup;
	
	@FindBy(xpath = "(//span[@class='SelectHDW_NEW'])[1]" )
    private WebElement selectHardwarePopupHardware;

	
	@FindBy(xpath = "(//input[@id='searchTextBtn'])[1]" )
    private WebElement searchFrame;
	
	
	
	@FindBy(xpath = "(//span[@id='searchTextIconLogo'])[1]" )
    private WebElement searchFrameSubmit;
	
	@FindBy(xpath = "(//img[@alt='Satin Black'])[2]" )
    private WebElement searchFrameResultClick;
	
	
	@FindBy(xpath = "(//select[@id='change_chart'])[1]" )
    private WebElement changeProductType;

	
	
	@FindBy(id = "glassinfoimg")
    private WebElement clickInfo;
	
	
	@FindBy(xpath = "(//span[@class='selectbtn'][normalize-space()='Select'])[1]")
    private WebElement clickGlass;
	
	@FindBy(xpath = "(//label[normalize-space()='Museum Quality'])[1]")
    private WebElement clickGlassTab;
	
	@FindBy(id = "glassnewdiv_22")
    private WebElement SelectGlass;
	
	
	
	@FindBy(xpath = "(//img)[94]")
    private WebElement HardwareClose;

	@FindBy(id = "mobile_addToCart_item_page")
    private WebElement AddToCart;
	
	@FindBy(id  = "custom_link_id_FRBW26074")
    private WebElement selectframeswithmats;
	
	@FindBy(xpath  = "(//img[@id='clgImgSmall3'])[1]")
    private WebElement selectCollage;
	
	@FindBy(xpath  = "(//img[@id='17'])[1]")
    private WebElement selectAcrylicPrints;
	
	@FindBy(xpath  = "(//img[@id='11'])[1]")
    private WebElement selectAcrylicFloating;
	
	@FindBy(xpath  = "(//img[@alt='8'])[1]")
    private WebElement selectSearchAcrylicFloating;
	
	@FindBy(xpath = "(//button[@class='start_order_btn uploadimage1'])[1]")
    private WebElement AcrylicShopNow;
	
	
	@FindBy(id  = "imageUploadNameText")
    private WebElement UploadImage;
	
	@FindBy(xpath = "(//button[@class='uploadbtn_common'])[1]")
    private WebElement UploadImagePopup;
	
	
	@FindBy(xpath = "(//button[@class='confirmBtns confirmBtns_desktop'])[1]")
    private WebElement UploadPopupConfirm;
	
	
	@FindBy(xpath = "(//div[@class='col-xs-4 opt_size'])[10]")
    private WebElement SizeChange;
	
	@FindBy(id = "myStandoff_1")
    private WebElement StandoffHardwareChange;
	
	
	@FindBy(id = "myStandoff_4")
    private WebElement FrenchCleatHardwareChange;

	@FindBy(id  = "mobile_addToCart_item_page")
    private WebElement AcrylicAddToCart;
	
	@FindBy(xpath  = "//div[@class='col-md-12 viewcartbtn']//span")
    private WebElement AcrylicViewCart;


	
	@FindBy(id = "checkout")
    private WebElement cartcheckout;
	
	
	@FindBy(xpath = "(//span[normalize-space()='View Cart'])[1]")
    private WebElement viewcart;
	
	@FindBy(id  = "ship_zip")
    private WebElement EnterZipcode;
	
	@FindBy(xpath = "(//span[@data-addminus='plusQty'])[1]")
    private WebElement QtyPlus;
	
	@FindBy(xpath = "(//span[@data-addminus='minusQty'])[1]")
    private WebElement QtyMinus;
	
	
	@FindBy(id  = "editedQty_0")
    private WebElement EditQty;
	
	
	@FindBy(xpath = "(//a[@class=' NeweditLink'])[1]")
    private WebElement Edit;
	
	@FindBy(xpath = "(//span)[72]")
    private WebElement ClickPopup;
	
	@FindBy(xpath = "(//button[@id='closingbtn'])[1]")
    private WebElement ClosePopup;

	
	
	@FindBy(id  = "coupon_code")
    private WebElement EnterCouponcode;
	
	@FindBy(xpath  = "(//input[@class='clsApplyNew'])[1]")
    private WebElement CouponApply ;
	
	@FindBy(xpath = "(//label[contains(@class,'giftCheckbox')])[1]")
    private WebElement SelectRush;
	
	@FindBy(xpath = "(//label[contains(@class,'giftCheckbox')])[2]")
    private WebElement SelectGift;
	
	@FindBy(id = "gift_card_head")
    private WebElement giftHead;
	
	@FindBy(id = "gift_card_message")
    private WebElement giftmessage;
	
	@FindBy(id = "gift_card_signature")
    private WebElement giftsignature;
	
	@FindBy(xpath = "(//a[@class='confirm-giftwrap gift_confirn_btn'])[1]")
    private WebElement SelectGiftConfirm;
	

	
	
	@FindBy(xpath = "(//img[contains(@class,'ProcessToPayment clscheckout')])[1]")
    private WebElement checkout;
	
	@FindBy(id  = "selectionImg_62863")
    private WebElement selectaddress;
	
	@FindBy(id = "credit-card-number")
    private WebElement identifycard;
	

    @FindBy(id = "braintree-hosted-field-number")
    private WebElement iframe;
	
	@FindBy(id = "credit-card-number")
	private WebElement creaditcard;
	
	@FindBy (id = "expiration")
	private WebElement expiryDate;
	
	@FindBy (id = "cvv")
	private WebElement cvvnumber;
	
	@FindBy (id = "postal-code")
	private WebElement postalcode;
	
	@FindBy (id = "confirmbtn_is")
	private WebElement braintreecheckout;
	
	
	
	  // Constructor
    public TestOrder (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    

        public void Zoomout(int zoomout) {
  	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
  		jsExecutor.executeScript("document.body.style.zoom='50%';");
 	}
        
  
    public void clickFrame() {
    	selectRegularFrame.click();
    	
    }
    
    public void clickSearchPageFrame() {
    	selectFrame.click();
    	
    }
    
    
    public void gotoAcrylicPrints() throws InterruptedException {
    
    	selectAcrylicPrints.click();
    	Thread.sleep(2000);
    	AcrylicShopNow.click();
    }	
    public void gotoAcrylicFlating() throws InterruptedException {
    	 driver.get("https://www.arttoframe.com/");
    	 selectAcrylicFloating.click();
    	 Thread.sleep(2000);
    	 selectSearchAcrylicFloating.click();
    	
    	
    
    }
    public void clickAnywhereUsingJS() {
        ((JavascriptExecutor) driver).executeScript("document.querySelector('body').click();");
    }
    
    
    public void RegularPageTest() throws InterruptedException  {
   // 	searchFrame.sendKeys("FRBW74079");
    //	Thread.sleep(2000);
   // 	searchFrameSubmit.click();
  //  	Thread.sleep(4000);
 //   	searchFrameResultClick.click();
    	changeFrame.click();
    	Thread.sleep(2000);
     	clickSeeAll.click();
     	Thread.sleep(4000);
     	seeAllFrame.click();
    	Thread.sleep(2000);
    	clickSeeAll.click();
    	Thread.sleep(2000);
    	seeAllSizeTab.click();
    	Thread.sleep(2000);
    	seeAllSize.click();
    	Thread.sleep(2000);
    	clickSeeAll.click();
    	Thread.sleep(2000);
    	seeAllGlassTab.click();
    	Thread.sleep(2000);
    	seeAllGlass.click();
    	Thread.sleep(2000);
    	clickSeeAll.click();
    	seeAllHardwareTab.click();
    	Thread.sleep(2000);
    	seeAllHardware.click();
    	Thread.sleep(2000);
    	seeAllClose.click();
    	Thread.sleep(2000);
    	clickSeeAll.click();
    	Thread.sleep(2000);
    	seeAllBackingTab.click();
    	Thread.sleep(2000);
    	seeAllBacking.click();
    	Thread.sleep(2000);
    	seeAllClose.click();
    	Thread.sleep(2000);
    	clickInfo.click();
    	Thread.sleep(2000);
    	clickGlass.click();
    	Thread.sleep(2000);
    	clickGlassTab.click();
    	Thread.sleep(2000);
    	SelectGlass.click();
    	Thread.sleep(2000);
    	AddToCart.click();
    	Thread.sleep(2000);
    	viewcart.click();
    	
   
  
    }
    
    
    public void CartPage() throws InterruptedException {
//    	ClickPopup.click();
//    	ClosePopup.click();
    	Thread.sleep(2000);
    	EnterZipcode.clear();
    	EnterZipcode.sendKeys("90001");
    	Thread.sleep(2000);
    	EditQty.sendKeys("2");
    	Thread.sleep(2000);
    	QtyPlus.click();
    	Thread.sleep(2000);
    	QtyMinus.click();
    	Thread.sleep(2000);    
    	EnterCouponcode.sendKeys("CS-74878");
    	CouponApply.click();
    	Thread.sleep(2000);
    	SelectRush.click();
    	Thread.sleep(2000);
    	SelectGift.click();
    	giftHead.sendKeys("TestHeader");
    	giftmessage.sendKeys("TestMessage");
    	giftsignature.sendKeys("TestFooter");
    	SelectGiftConfirm.click();
    	Edit.click();
    	AddToCart.click();
    	Thread.sleep(2000);
    	viewcart.click();
    	Thread.sleep(2000);
    	cartcheckout.click();
    	
    	
    	
    	
    	
    }
    
    
    public void AcrylicPageTest() throws InterruptedException, AWTException {
    	UploadImage.click();
    	Thread.sleep(3000);
    	UploadImagePopup.click();
    	Robot rb = new Robot();
    	Thread.sleep(2000);
    	//out path to the file in clipboard
    	StringSelection ss = new StringSelection("F:\\Test\\TestImage.jpg");
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    	//CTRL v
    	rb.keyPress(KeyEvent.VK_CONTROL);
    	rb.keyPress(KeyEvent.VK_V);
    	Thread.sleep(2000);
    	
    	rb.keyRelease(KeyEvent.VK_CONTROL);
    	rb.keyRelease(KeyEvent.VK_V);
    	Thread.sleep(2000);
    	
    	rb.keyPress(KeyEvent.VK_ENTER);
    	rb.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(10000);    	
    	UploadPopupConfirm.click();
    	Thread.sleep(2000);
    	SizeChange.click();
    	Thread.sleep(2000);
    	StandoffHardwareChange.click();
    	Thread.sleep(2000);
    	FrenchCleatHardwareChange.click();
    	AcrylicAddToCart.click();
    	Thread.sleep(2000);
    	AcrylicViewCart.click();
    	
    }
    
    
   

   
    public void checkout() {
    	checkout.click();
    	
    }	
    public void addressSelection() {
    	selectaddress.click();   	
    }

    public void goToFrameWithMatSearch() {
    	driver.get("https://www.arttoframe.com/search/picture-frames-with-mats");
    }
    
    public void clickFramesWithMat() {
    	selectframeswithmats.click();  	
    }
    

    
    public void cardIdentify() {
    	identifycard.click();
    }
   
    public void enterCardDetails(String number,String date,String cvv,String code) {
    	driver.switchTo().frame(iframe);
    	creaditcard.sendKeys(number);
    	expiryDate.sendKeys(date);
    	cvvnumber.sendKeys(cvv);
    	postalcode.sendKeys(code);
    	braintreecheckout.click();
   
    }
}
