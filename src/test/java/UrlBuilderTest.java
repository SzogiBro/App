import org.junit.Assert;
import org.junit.Test;

public class UrlBuilderTest {

	@Test
	public void addPathToUrl() throws Exception {
		Assert.assertEquals("http://rikitiki.wikia.com/wiki/Special:Version", UrlBuilder.addPathToUrl("http://rikitiki.wikia.com", "/wiki/Special:Version"));
	}

	@Test
	public void addPathToUrlWithTrailingSlash() throws Exception {
		Assert.assertEquals("http://rikitiki.wikia.com/wiki/Special:Version", UrlBuilder.addPathToUrl("http://rikitiki.wikia.com/", "/wiki/Special:Version"));
	}

	@Test
	public void addPathToUrlWithTrailingSlash2() throws Exception {
		Assert.assertEquals("http://rikitiki.wikia.com/wiki/Special:Version", UrlBuilder.addPathToUrl("http://rikitiki.wikia.com/", "/wiki/Special:Version"));
	}

}