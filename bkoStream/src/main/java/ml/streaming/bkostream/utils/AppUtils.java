package ml.streaming.bkostream.utils;

import org.springframework.beans.BeanUtils;

import ml.streaming.bkostream.model.Category;
import ml.streaming.bkostream.model.Comment_Playlist;
import ml.streaming.bkostream.model.Comment_Singer;
import ml.streaming.bkostream.model.Comment_Song;
import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.model.Playlist_Song;
import ml.streaming.bkostream.model.Role;
import ml.streaming.bkostream.model.Singer;
import ml.streaming.bkostream.model.Singer_And_Song;
import ml.streaming.bkostream.dto.Categorydto;
import ml.streaming.bkostream.dto.Comment_Playlistdto;
import ml.streaming.bkostream.dto.Comment_Singerdto;
import ml.streaming.bkostream.dto.Comment_Songdto;
import ml.streaming.bkostream.dto.Playlist_Songdto;
import ml.streaming.bkostream.dto.Playlistdto;
import ml.streaming.bkostream.dto.Roledto;
import ml.streaming.bkostream.dto.Singer_And_Songdto;
import ml.streaming.bkostream.dto.Singerdto;
import ml.streaming.bkostream.dto.Songdto;
import ml.streaming.bkostream.dto.Userdto;
import ml.streaming.bkostream.model.Song;
import ml.streaming.bkostream.model.User;

public class AppUtils {
    
    public static Songdto entityToDto(Song song){
        Songdto songdto = new Songdto();
        BeanUtils.copyProperties(song, songdto);
        return songdto;
    }

    public static Song dtoToEntity(Songdto songdto){
        Song song = new Song();
        BeanUtils.copyProperties(songdto, song);
        return song;
    }



    public static Userdto entityToDto(User user){
        Userdto userdto = new Userdto();
        BeanUtils.copyProperties(user, userdto);
        return userdto;
    }

    public static User dtoToEntityUser(Userdto userdto){
        User user = new User();
        BeanUtils.copyProperties(userdto, user);
        return user;
    }



    public static Playlistdto entityToDto(Playlist playlist){
        Playlistdto playlistdto = new Playlistdto();
        BeanUtils.copyProperties(playlist, playlistdto);
        return playlistdto;
    }

    public static Playlist dtoToEntity(Playlistdto playlistdto){
        Playlist playlist = new Playlist();
        BeanUtils.copyProperties(playlistdto, playlist);
        return playlist;
    }



    public static Comment_Playlistdto entityToDto(Comment_Playlist comment_Playlist){
        Comment_Playlistdto Comment_Playlistdto = new Comment_Playlistdto();
        BeanUtils.copyProperties(comment_Playlist, Comment_Playlistdto);
        return Comment_Playlistdto;
    }

    public static Comment_Playlist dtoToEntity(Comment_Playlistdto comment_Playlistdto){
        Comment_Playlist comment_Playlist = new Comment_Playlist();
        BeanUtils.copyProperties(comment_Playlistdto, comment_Playlist);
        return comment_Playlist;
    }
    




    public static Comment_Singerdto entityToDto(Comment_Singer comment_Singer){
        Comment_Singerdto comment_Singerdto = new Comment_Singerdto();
        BeanUtils.copyProperties(comment_Singer, comment_Singerdto);
        return comment_Singerdto;
    }

    public static Comment_Singer dtoToEntity(Comment_Singerdto comment_Singerdto){
        Comment_Singer comment_Singer = new Comment_Singer();
        BeanUtils.copyProperties(comment_Singerdto, comment_Singer);
        return comment_Singer;
    }






    public static Comment_Songdto entityToDto(Comment_Song comment_Song){
        Comment_Songdto comment_Songdto = new Comment_Songdto();
        BeanUtils.copyProperties(comment_Song, comment_Songdto);
        return comment_Songdto;
    }

    public static Comment_Song dtoToEntity(Comment_Songdto comment_Songdto){
        Comment_Song comment_Song = new Comment_Song();
        BeanUtils.copyProperties(comment_Songdto, comment_Song);
        return comment_Song;
    }





    public static Playlist_Songdto entityToDto(Playlist_Song playlist_Song){
        Playlist_Songdto playlist_Songdto = new Playlist_Songdto();
        BeanUtils.copyProperties(playlist_Song, playlist_Songdto);
        return playlist_Songdto;
    }

    public static Playlist_Song dtoToEntity(Playlist_Songdto playlist_Songdto){
        Playlist_Song playlist_Song = new Playlist_Song();
        BeanUtils.copyProperties(playlist_Songdto, playlist_Song);
        return playlist_Song;
    }





    public static Roledto entityToDto(Role role){
        Roledto roledto = new Roledto();
        BeanUtils.copyProperties(role, roledto);
        return roledto;
    }

    public static Role dtoToEntity(Roledto roledto){
        Role role = new Role();
        BeanUtils.copyProperties(roledto, role);
        return role;
    }




    public static Singerdto entityToDto(Singer singer){
        Singerdto singerdto = new Singerdto();
        BeanUtils.copyProperties(singer, singerdto);
        return singerdto;
    }

    public static Singer dtoToEntity(Singerdto singerdto){
        Singer singer = new Singer();
        BeanUtils.copyProperties(singerdto, singer);
        return singer;
    }





    public static Singer_And_Songdto entityToDto(Singer_And_Song singer_And_Song){
        Singer_And_Songdto singer_And_Songdto = new Singer_And_Songdto();
        BeanUtils.copyProperties(singer_And_Songdto, singer_And_Song);
        return singer_And_Songdto;
    }

    public static Singer_And_Song dtoToEntity(Singer_And_Songdto singer_And_Songdto){
        Singer_And_Song singer_And_Song = new Singer_And_Song();
        BeanUtils.copyProperties(singer_And_Songdto, singer_And_Song);
        return singer_And_Song;
    }






    public static Categorydto entityToDto(Category category){
        Categorydto categorydto = new Categorydto();
        BeanUtils.copyProperties(category, categorydto);
        return categorydto;
    }

    public static Category dtoToEntity(Categorydto categorydto){
        Category category = new Category();
        BeanUtils.copyProperties(categorydto, category);
        return category;
    }

}
