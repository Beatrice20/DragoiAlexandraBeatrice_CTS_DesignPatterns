package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categorii.Categorie1;
import teste.AplicaDiscountTest;
import teste.PoateRezervaTest;

@RunWith(Categories.class)
@SuiteClasses({ AplicaDiscountTest.class, PoateRezervaTest.class })
@ExcludeCategory(Categorie1.class)
public class SuitaCustom {

}
