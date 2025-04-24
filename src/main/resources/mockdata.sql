-- Cleanup (DELETE) statements - use these to clean the database when needed
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
    ('Welcome to FTN', 'Shaping the Future of Technology Education', '/assets/images/hero1.jpg', '/about'),
    ('Research & Innovation', 'Pushing Boundaries in Technology', '/assets/images/hero2.jpg', '/research'),
    ('Student Success', 'Join Our Community of Innovators', '/assets/images/hero3.jpg', '/admissions'),
    ('Industry Partnerships', 'Bridging Academia and Industry', '/assets/images/hero4.jpg', '/partnerships');

-- Insert Features data
INSERT INTO features (title, description, link) VALUES
    ('Academic Programs', 'Discover our cutting-edge programs in engineering and technology', '/programs'),
    ('Research Labs', 'State-of-the-art facilities for breakthrough research', '/research-labs'),
    ('Student Projects', 'Real-world projects and hands-on learning experiences', '/projects'),
    ('Industry Connect', 'Strong partnerships with leading tech companies', '/industry');

-- Insert News Items data
INSERT INTO news_items (title, excerpt, date, image_url, category) VALUES
    ('New AI Research Center', 'FTN launches cutting-edge artificial intelligence research center', CURRENT_TIMESTAMP - INTERVAL '1 day', '/assets/images/news1.jpg', 'Research'),
    ('International Conference Success', 'FTN hosts successful international technology conference', CURRENT_TIMESTAMP - INTERVAL '2 days', '/assets/images/news2.jpg', 'Events'),
    ('Student Team Wins Competition', 'FTN students win prestigious robotics competition', CURRENT_TIMESTAMP - INTERVAL '3 days', '/assets/images/news3.jpg', 'Achievement'),
    ('New Industry Partnership', 'Partnership announced with leading tech company', CURRENT_TIMESTAMP - INTERVAL '4 days', '/assets/images/news4.jpg', 'Partnership'),
    ('Faculty Research Award', 'Professor receives prestigious research grant', CURRENT_TIMESTAMP - INTERVAL '5 days', '/assets/images/news5.jpg', 'Achievement'),
    ('Innovation Hub Opening', 'New innovation hub opens for student projects', CURRENT_TIMESTAMP - INTERVAL '6 days', '/assets/images/news6.jpg', 'Facility');

-- Insert Events data
INSERT INTO events (title, date_time, location, type, status) VALUES
    ('Tech Innovation Summit', CURRENT_TIMESTAMP + INTERVAL '30 days', 'Main Auditorium', 'COMPETITION', 'UPCOMING'),
    ('AI Workshop Series', CURRENT_TIMESTAMP + INTERVAL '7 days', 'Lab 101', 'TRAINING', 'UPCOMING'),
    ('Industry Meet & Greet', CURRENT_TIMESTAMP + INTERVAL '14 days', 'Conference Hall', 'MEETING', 'UPCOMING'),
    ('Hackathon 2025', CURRENT_TIMESTAMP + INTERVAL '21 days', 'Innovation Center', 'COMPETITION', 'UPCOMING'),
    ('Research Symposium', CURRENT_TIMESTAMP + INTERVAL '45 days', 'Research Wing', 'MEETING', 'UPCOMING'),
    ('Programming Boot Camp', CURRENT_TIMESTAMP + INTERVAL '10 days', 'Computer Lab 201', 'TRAINING', 'UPCOMING');

-- Verify counts (optional)
-- SELECT COUNT(*) FROM hero_slides;
-- SELECT COUNT(*) FROM features;
-- SELECT COUNT(*) FROM news_items;
-- SELECT COUNT(*) FROM events;