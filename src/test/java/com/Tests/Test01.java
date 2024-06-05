package com.Tests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.Pages.HomePage;
import com.Pages.RegisterPage;
import com.Pages.SearchPage;
import com.Pages.ProductPage;

public class Test01 extends BaseTest {

	@Test
		public void testRegistroBusquedaAdicionProducto() {
			driver.get("https://opencart.abstracta.us/index.php?route=common/home");

			// Página de inicio
//			HomePage homePage = new HomePage(driver);
//			homePage.goToRegisterPage();
//
//			// Página de registro
//			RegisterPage registerPage = new RegisterPage(driver);
//			registerPage.register("John", "Doe", "john.doe@example.com", "123456789", "password123");
//
//			// Buscar producto
//			SearchPage searchPage = new SearchPage(driver);
//			searchPage.searchProduct("MacBook");
//
//			// Añadir producto a la cesta
//			ProductPage productPage = new ProductPage(driver);
//			productPage.addToCart();
		}
}
