package com.aluracursos.repoduccionAudio.modelos;

public class Cancion extends Audio{
        private String interprete;
        private String autor;
        private String album;
        private String genero;

        @Override
        public int getClasificacion() {
                if (getTotalDeMeGusta() > 5000){
                        return 8;
                } else {
                        return 4;
                }
        }

        public String getInterprete() {
                return interprete;
        }

        public void setInterprete(String interprete) {
                this.interprete = interprete;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public String getAlbum() {
                return album;
        }

        public void setAlbum(String album) {
                this.album = album;
        }

        public String getGenero() {
                return genero;
        }

        public void setGenero(String genero) {
                this.genero = genero;
        }
}
