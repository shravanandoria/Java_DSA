# https://www.youtube.com/playlist?list=PL19E79A0638C8D449

from pytube import Playlist

playlist_url = "https://www.youtube.com/playlist?list=PL19E79A0638C8D449"
playlist = Playlist(playlist_url)

print(f"Playlist title: {playlist.title}")
for video in playlist.videos:
    print(video.title)
