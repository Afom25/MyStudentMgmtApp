package com.example.studentmgt.service;

import com.example.studentmgt.model.Transcript;

public interface TranscriptService {
    Iterable<Transcript> getAllTranscripts();
    Transcript saveTranscript(Transcript transcript);
}
