package qr.code.qr;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@Controller
@RequestMapping("/qrcode")
@CrossOrigin(origins = "*")
public class RestController {

    @PostMapping(value = "/generate", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> getQRCode(@RequestBody String link) throws Exception {
        return ResponseEntity.ok(QRCodeGenerator.generateQRCodeImage(link));
    }

}