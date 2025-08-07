CREATE TABLE Artists(
	Artist_id INT,
	Artist_name VARCHAR(50)
	);

INSERT INTO Artists VALUES(1,'Aparshakti Khurana');

INSERT INTO Artists VALUES(2,'Ed Sheeran');

INSERT INTO Artists VALUES(3,'Shreya Ghoshal');

INSERT INTO Artists VALUES(4,'Arijit Singh');

INSERT INTO Artists VALUES(5,'Tanishk Bagchi');

SELECT * FROM Artists;

CREATE TABLE Albums(
	Album_id VARCHAR(50),
	Album_title VARCHAR(50),
	Artist_id INT,
	Release_year VARCHAR(50)
	);

INSERT INTO Albums VALUES('1001','Album1',1,'2019');

INSERT INTO Albums VALUES('1002','Album2',2,'2015');

INSERT INTO Albums VALUES('1003','Album3',3,'2018');

INSERT INTO Albums VALUES('1004','Album4',4,'2020');

INSERT INTO Albums VALUES('1005','Album5',2,'2020');

INSERT INTO Albums VALUES('1006','Album6',1,'2009');

SELECT * FROM Albums;

CREATE TABLE Songs (
    Song_id INT,
    Song_title VARCHAR(255),
    Duration DECIMAL(5,2),
    Genre VARCHAR(100),
    Album_id INT
);

INSERT INTO Songs (Song_id, Song_title, Duration, Genre, Album_id) VALUES
(101, 'Zaroor', 2.55, 'Feel good', 1001),
(102, 'Espresso', 4.10, 'Rhythmic', 1002),
(103, 'Shayad', 3.20, 'Sad', 1003),
(104, 'Roar', 4.05, 'Pop', 1002),
(105, 'Everybody Talks', 3.35, 'Rhythmic', 1003),
(106, 'Dwapara', 3.54, 'Dance', 1002),
(107, 'Sa Re Ga Ma', 4.20, 'Rhythmic', 1004),
(108, 'Tauba', 4.05, 'Rhythmic', 1005),
(109, 'Perfect', 4.23, 'Pop', 1002),
(110, 'Good Luck', 3.55, 'Rhythmic', 1004);

SELECT * FROM Songs;

--Part – A
--1. Retrieve a unique genre of songs.

SELECT DISTINCT Genre FROM Songs;

--2. Find top 2 albums released before 2010.

SELECT TOP 2 *FROM Albums
WHERE Release_year<'2010';

--3. Insert Data into the Songs Table. (1245, ‘Zaroor’, 2.55, ‘Feel good’, 1005)

INSERT INTO Songs VALUES(1245, 'Zaroor', 2.55, 'Feel good', 1005);

--4. Change the Genre of the song ‘Zaroor’ to ‘Happy’

UPDATE Songs
SET Genre='Happy'
WHERE Song_title='Zaroor';

--5. Delete an Artist ‘Ed Sheeran’

DELETE FROM Artists
WHERE Artist_name='Ed Sheeran';

--6. Add a New Column for Rating in Songs Table. [Ratings decimal(3,2)]

ALTER TABLE Songs
ADD Rating Decimal(3,2);

--7. Retrieve songs whose title starts with 'S'.

SELECT *FROM Songs
WHERE Song_title LIKE 'S%';

--8. Retrieve all songs whose title contains 'Everybody'.

SELECT *FROM Songs
WHERE Song_title LIKE '%Everybody%';

--9. Display Artist Name in Uppercase.

SELECT UPPER(Artist_name) FROM Artists;

--10. Find the Square Root of the Duration of a Song ‘Good Luck’

SELECT SQRT(Duration) FROM Songs
WHERE Song_title='Good Luck';

--11. Find Current Date.

SELECT GETDATE();

--12. Find the number of albums for each artist.

SELECT COUNT(Album_id),Artist_id FROM Albums
GROUP BY Artist_id;

--13. Retrieve the Album_id which has more than 5 songs in it.

SELECT Album_id
FROM Songs
GROUP BY Album_id
HAVING COUNT(Song_id) > 3;

--14. Retrieve all songs from the album 'Album1'. (using Subquery)

SELECT *FROM Songs
WHERE Album_id=(SELECT Album_id FROM Albums
	WHERE Album_title='Album1'
)

--15. Retrieve all albums name from the artist ‘Aparshakti Khurana’ (using Subquery)

SELECT Album_title FROM Albums
WHERE Artist_id=(
	SELECT Artist_id FROM Artists
	WHERE Artist_name='Aparshakti Khurana'
)
	
--16. Retrieve all the song titles with its album title.

SELECT Song_title,Album_title FROM Songs JOIN Albums
ON Songs.Album_id=Albums.Album_id;

--17. Find all the songs which are released in 2020.

SELECT Song_title FROM Songs JOIN Albums
ON Songs.Album_id=Albums.Album_id
WHERE Release_year='2020';

--18. Create a view called ‘Fav_Song’ from the songs table having songs with song_id 101-105.

CREATE VIEW Fav_Song AS
SELECT * FROM Songs
WHERE Song_id BETWEEN 101 AND 105;

--19. Update a song name to ‘Jannat’ of song having song_id 101 in Fav_Song view.

UPDATE Fav_Song
SET Song_title='Jannat'
WHERE song_id='101';

--20. Find all artists who have released an album in 2020.

SELECT Artists.Artist_name,Albums.Release_year
FROM Artists JOIN Albums
ON Artists.Artist_id=Albums.Artist_id
WHERE Albums.Release_year='2020';

--21. Retrieve all songs by Shreya Ghoshal and order them by duration.

SELECT Song_title,Duration
FROM Artists JOIN Albums ON Artists.Artist_id=Albums.Artist_id 
JOIN Songs ON Albums.Album_id=Songs.Album_id
WHERE Artist_name='Shreya Ghoshal'
ORDER BY Duration;

--Part – B
--22. Retrieve all song titles by artists who have more than one album.

SELECT Song_title,Artist_name 
FROM Artists JOIN Albums ON Artists.Artist_id=Albums.Artist_id
JOIN Songs ON Albums.Album_id=Songs.Album_id
WHERE Albums.Artist_id IN (
	SELECT Artist_id FROM Albums
	GROUP BY Artist_id
	HAVING COUNT(Album_title)>1
)

--23. Retrieve all albums along with the total number of songs.

SELECT Album_id,COUNT(Song_title) FROM Songs
GROUP BY Album_id

--24. Retrieve all songs and release year and sort them by release year.

SELECT Song_title,Release_year FROM Songs 
JOIN Albums ON Songs.Album_id=Albums.Album_id
ORDER BY Release_year;

--25. Retrieve the total number of songs for each genre, showing genres that have more than 2 songs.

SELECT Genre,COUNT(Song_title)
FROM Songs
GROUP BY Genre
HAVING COUNT(Song_title)>2;

--26. List all artists who have albums that contain more than 3 songs.

SELECT Artists.Artist_id
FROM Albums JOIN Artists ON Artists.Artist_id=Albums.Artist_id
WHERE Albums.Album_id IN (
	SELECT Album_id FROM Songs
	GROUP BY Album_id
	HAVING COUNT(Song_id)>3
)

--Part – C
--27. Retrieve albums that have been released in the same year as 'Album4'
--28. Find the longest song in each genre
--29. Retrieve the titles of songs released in albums that contain the word 'Album' in the title.
--30. Retrieve the total duration of songs by each artist where total duration exceeds 15 minutes.