package com.example.kk4b

import androidx.versionedparcelable.VersionedParcelable
import androidx.versionedparcelable.VersionedParcelize

@VersionedParcelize

data class Superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String,
) : VersionedParcelable
