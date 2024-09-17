package testDataset;

import com.cohort.util.File2;
import gov.noaa.pfel.coastwatch.sgt.SgtMap;
import gov.noaa.pfel.erddap.dataset.EDD;
import gov.noaa.pfel.erddap.util.EDStatic;

public class Initialization {
  public static void edStatic() {
    EDStatic.setWebInfParentDirectory(System.getProperty("user.dir") + "/");
    System.setProperty(
        "erddapContentDirectory", System.getProperty("user.dir") + "/development/test/");
    System.setProperty("skipEmailThread", String.valueOf(true));
    System.setProperty("allowDeferedLoading", String.valueOf(false));
    EDD.debugMode = true;
    SgtMap.fontFamily = "SansSerif";
    EDStatic.useSaxParser = false;
  }
}
