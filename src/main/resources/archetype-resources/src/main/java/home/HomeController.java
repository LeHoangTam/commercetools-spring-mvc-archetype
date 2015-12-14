package ${package}.home;

import io.sphere.sdk.client.BlockingSphereClient;
import io.sphere.sdk.products.ProductProjection;
import io.sphere.sdk.products.queries.ProductProjectionQuery;
import io.sphere.sdk.queries.PagedQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class HomeController {

	@Autowired
	private BlockingSphereClient sphereClient;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(final Model model) {
		final PagedQueryResult<ProductProjection> queryResult = sphereClient.executeBlocking(ProductProjectionQuery.ofCurrent());
		model.addAttribute("allProducts", queryResult.getResults());
		model.addAttribute("locale", Locale.ENGLISH);

		return "home/index";
	}
}