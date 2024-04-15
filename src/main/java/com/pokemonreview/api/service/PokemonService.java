package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.PokemonDto;
import com.pokemonreview.api.dto.PokemonResponse;

import java.util.List;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
    PokemonResponse getAllPokemons(int PageNO, int pageSize);
    PokemonDto getPokemonById(int id);
    PokemonDto updatePokemon(PokemonDto pokemonDto,int in);
    void deletePokemon(int id);

}
