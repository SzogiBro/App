public class Main {

	public static void main(String[] args) {
		String url = "http://rikitiki.wikia.com";
		String path = "/wiki/Special:Version";

		System.out.println(UrlBuilder.addPathToUrl(url, path));
	}
}
