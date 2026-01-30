package br.com.filmesfavoritos.modelos;

import com.google.gson.annotations.SerializedName;

public record FilmeOMDB(@SerializedName("Title") String title,
                        @SerializedName("Year") String year,
                        @SerializedName("Director") String director) {
}
