package Backend.Custom_tech.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class TechDto {


    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "email is required")
    private String email;

    @NotBlank(message = "message is required")
    private String message;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
