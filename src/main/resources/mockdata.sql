-- Cleanup (DELETE) statements
DELETE FROM events;
DELETE FROM news_items;
DELETE FROM features;
DELETE FROM hero_slides;

-- Reset sequences
ALTER SEQUENCE events_id_seq RESTART WITH 1;
ALTER SEQUENCE news_items_id_seq RESTART WITH 1;
ALTER SEQUENCE features_id_seq RESTART WITH 1;
ALTER SEQUENCE hero_slides_id_seq RESTART WITH 1;

-- Insert Hero Slides data
INSERT INTO hero_slides (title, subtitle, image, link) VALUES
    ('Join the Elite of Tunisian Swimming', 'Developing Champions Since 1957', '/assets/images/hero1.jpg', '/programs'),
    ('National Swimming Championships 2025', 'Witness Tunisia''s Best Compete', '/assets/images/hero2.jpg', '/competitions'),
    ('Swimming Schools Across Tunisia', 'Learn from Certified Coaches', '/assets/images/hero3.jpg', '/schools'),
    ('Olympic Training Center', 'World-Class Facilities in Radès', '/assets/images/hero4.jpg', '/facilities');

-- Insert Features data
INSERT INTO features (title, description, link) VALUES
    ('Competition Calendar', 'Stay updated with national and international swimming competitions', '/competitions'),
    ('Swimming Programs', 'Professional training programs for all ages and skill levels', '/programs'),
    ('Training Centers', 'Find certified swimming facilities across Tunisia', '/centers'),
    ('National Team', 'Meet Tunisia''s elite swimmers and follow their achievements', '/national-team');

-- Insert News Items data
INSERT INTO news_items (title, excerpt, date, image_url, category) VALUES
    ('Tunisian Swimmers Qualify for Paris Olympics', 'Three Tunisian swimmers secure spots in multiple events for the 2024 Olympics', CURRENT_TIMESTAMP - INTERVAL '1 day', '/assets/images/news1.jpg', 'Competition'),
    ('New Swimming Center in Sousse', 'State-of-the-art Olympic swimming facility opens its doors in Sousse', CURRENT_TIMESTAMP - INTERVAL '2 days', '/assets/images/news2.jpg', 'Facilities'),
    ('National Age Group Championships Success', 'Young talents shine at the National Age Group Championships in Radès', CURRENT_TIMESTAMP - INTERVAL '3 days', '/assets/images/news3.jpg', 'Youth'),
    ('Advanced Coach Training Program Launched', 'Federation introduces new certification program for swimming coaches', CURRENT_TIMESTAMP - INTERVAL '4 days', '/assets/images/news4.jpg', 'Education'),
    ('Mediterranean Swimming Success', 'Tunisian team brings home 5 medals from Mediterranean Championships', CURRENT_TIMESTAMP - INTERVAL '5 days', '/assets/images/news5.jpg', 'International'),
    ('Swimming Schools Registration Open', 'Summer swimming program registration now open across Tunisia', CURRENT_TIMESTAMP - INTERVAL '6 days', '/assets/images/news6.jpg', 'Programs');

-- Insert Events data
INSERT INTO events (title, date_time, location, type, status) VALUES
    ('National Swimming Championships', CURRENT_TIMESTAMP + INTERVAL '30 days', 'Olympic Pool Radès', 'COMPETITION', 'UPCOMING'),
    ('Youth Swimming Camp', CURRENT_TIMESTAMP + INTERVAL '7 days', 'Monastir Swimming Center', 'TRAINING', 'UPCOMING'),
    ('Coaches Technical Meeting', CURRENT_TIMESTAMP + INTERVAL '14 days', 'Federation Headquarters, Tunis', 'MEETING', 'UPCOMING'),
    ('Open Water Swimming Competition', CURRENT_TIMESTAMP + INTERVAL '21 days', 'Hammamet Beach', 'COMPETITION', 'UPCOMING'),
    ('Regional Training Workshop', CURRENT_TIMESTAMP + INTERVAL '45 days', 'Sfax Olympic Pool', 'TRAINING', 'UPCOMING'),
    ('National Team Trials', CURRENT_TIMESTAMP + INTERVAL '10 days', 'Olympic Pool Radès', 'COMPETITION', 'UPCOMING');