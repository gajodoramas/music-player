package com.gajodoramas.musicplayer

data class Cancion (val cancion : Int, val titulo : String, val artista : String,
                    val album : String, val enlace : String, val imagen : Int, var favorito : Boolean){

    companion object {
        val listaCanciones : ArrayList<Cancion> = ArrayList()

        fun crearLista() {
            listaCanciones.add(
                Cancion(R.raw.energy, "Energy",
                    "vaitsez", "Energy Music", "https://pixabay.com/es/users/vaitsez-54581655/",
                    R.drawable.energy, false)
            )
            listaCanciones.add(
                Cancion(R.raw.event, "Event",
                    "prettyjohn1", "Late Event", "https://pixabay.com/es/users/prettyjohn1-54616349/",
                    R.drawable.event, false)
            )
            listaCanciones.add(
                Cancion(R.raw.motivational, "Motivational",
                    "prettyjohn1", "Motivational Music", "https://pixabay.com/es/users/prettyjohn1-54616349/",
                    R.drawable.motivational, false)
            )
            listaCanciones.add(
                Cancion(R.raw.saxophone, "Saxophone",
                    "prettyjohn1", "Saxomusic", "https://pixabay.com/es/users/prettyjohn1-54616349/",
                    R.drawable.saxophone, false)
            )
            listaCanciones.add(
                Cancion(R.raw.summer, "Summer",
                    "GR0ZA", "Summer Vibes", "https://pixabay.com/es/users/gr0za-54059129/",
                    R.drawable.summer, false)
            )
        }

    }
}