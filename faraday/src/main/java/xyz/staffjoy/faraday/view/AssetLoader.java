package xyz.staffjoy.faraday.view;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Component
public class AssetLoader {

    private String imageBase64;
    private byte[] faviconBytes;

    static final String IMAGE_FILE_PATH = "static/assets/images/staffjoy_coffee.png";
    static final String FAVICON_FILE_PATH = "static/assets/images/favicon.ico";

    public String getImageBase64() {
        return this.imageBase64;
    }

    public byte[] getFaviconFile() { return this.faviconBytes; }

    @PostConstruct
    public void init() throws IOException {

        // load image
        File imageFile = this.getImageFile(IMAGE_FILE_PATH);
        byte[] encodedImage = Files.readAllBytes(imageFile.toPath());
        byte[] base64EncodedImage = Base64Utils.encode(encodedImage);
        imageBase64 = new String(base64EncodedImage);

        // load favicon
        File faviconFile = this.getImageFile(FAVICON_FILE_PATH);
        faviconBytes = Files.readAllBytes(faviconFile.toPath());
    }

    private File getImageFile(String path) throws IOException {
        return new ClassPathResource(path).getFile();
    }
}
