package io.antmedia.cluster;

import io.antmedia.webrtc.VideoCodec;

public interface IStreamInfo {

	/**
	 * Returns the height of the video
	 * @return
	 */
	public int getVideoHeight();

	/**
	 * Returns the width of the video
	 * @return
	 */
	public int getVideoWidth();


	/**
	 * Returns the video bitrate 
	 * @return bps
	 */
	public int getVideoBitrate();


	/**
	 * Returns the audio bitrate
	 * @return
	 */
	public int getAudioBitrate();
	
	/**
	 * @return the video codec 
	 */
	public VideoCodec getVideoCodec();

}
