// Generated by Selenium IDE
const { Builder, By, Key, until } = require('selenium-webdriver');
const {assert} = require('chai');

describe('john-travolta', function() {
  this.timeout(30000);
  let driver
  let vars
  beforeEach(async function() {
    driver = await new Builder()
              .forBrowser('chrome')
              .withCapabilities(
                {
                  browserName: 'chrome',
                  unexpectedAlertBehaviour: 'ignore'
                }
              )
              .build();
    vars = {};
  });
  afterEach(async function() {
    await driver.quit();
  });
  it('base-default', async function() {
    // await driver.switchTo().alert().accept();
    await driver.get("https://john-travolta.sanjari.id/");
    await driver.sleep(2000);

    await assert.equal("Hitung Gaji Pokok", await driver.getTitle());
    await assert.equal("Rp. 15.000",   await driver.findElement(By.id('gn')).getAttribute("value"));
    await assert.equal("Rp. 22.500",   await driver.findElement(By.id('gl')).getAttribute("value"));
    await assert.equal("Rp. 600.000",  await driver.findElement(By.id('pe')).getAttribute("value"));
    await assert.equal("40",           await driver.findElement(By.id('jp')).getAttribute("value"));
    await assert.equal("52",           await driver.findElement(By.id('jk')).getAttribute("value"));

    await driver.findElement(By.css("input:nth-child(6)")).click();
    let alert = await driver.switchTo().alert(); 
    await alert.accept();
    await assert.equal("Gaji : Rp. 870.000, dan bisa menabung sebesar Rp. 270.000", await alert.getText());
    await driver.close();
  });
});