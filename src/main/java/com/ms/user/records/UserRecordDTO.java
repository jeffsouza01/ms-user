package com.ms.user.records;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRecordDTO(@NotNull @NotBlank String name,
                            @NotNull @NotBlank @Email String email) {
}
